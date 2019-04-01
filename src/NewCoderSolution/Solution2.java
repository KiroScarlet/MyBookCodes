package NewCoderSolution;

import org.hamcrest.core.IsInstanceOf;

/**
 * @author KiroScarlet
 * @date 2019-03-21  -22:57
 */
public class Solution2 {
        public double Power(double base, int exponent) {
            if(exponent==0)
                return 1;
            if(exponent==1)
                return base;
            return Power(base,exponent-1)*base;
        }

    public static void main(String[] args) {
        Solution2 solution2=new Solution2();
        System.out.println(solution2.Power(1545562.2,2344));
    }
}
