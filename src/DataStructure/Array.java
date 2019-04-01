package DataStructure;

/**
 * @author KiroScarlet
 * @date 2019-03-12  -22:41
 */
class MyArray {

    private String[] strArray;
    private int lengh = 0;

    public MyArray(int max) {
        lengh = max;
        strArray = new String[max];
    }

    public int contains(String target) {
        int index = -1;
        for (int i = 0; i < lengh; i++) {
            if (strArray[i].equals(target)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void insert(String elem) {
        
    }
}
