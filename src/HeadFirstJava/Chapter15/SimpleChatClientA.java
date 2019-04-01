package HeadFirstJava.Chapter15;

import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author KiroScarlet
 * @date 2019-03-11  -22:35
 */
public class SimpleChatClientA {
    JTextField outgoing;
    PrintWriter writer;
    Socket sock;
    public void go() {
        JFrame frame = new JFrame("Simple Chat");
        JPanel mainPanel = new JPanel();
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("send");

        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        setUpNetworking();
        frame.setSize(400, 599);
        frame.setVisible(true);
    }
    private void setUpNetworking() {
        try {
            sock = new Socket("127.0.0.1", 5000);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("networking established");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public class SendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            writer.print(outgoing.getText());
            writer.flush();
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }

}
