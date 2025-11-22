import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 测试类：L2023111723_13_Test
 * 测试用例设计原则：
 * - 等价类划分：将输入划分为有效等价类和无效等价类
 * - 边界值分析：测试数组边界情况
 * - 全覆盖：确保所有颜色(0,1,2)都被测试到
 */
public class L2023111723_13_Test {
    
    /**
     * 测试目的：验证正常情况下的颜色分类
     * 测试用例：混合顺序的数组 [2,0,2,1,1,0]
     */
    @Test
    public void testSortColorsNormal() {
        Solution solution = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] expected = {0, 0, 1, 1, 2, 2};
        
        solution.sortColors(nums);
        assertArrayEquals(expected, nums);
    }
    
    /**
     * 测试目的：验证最小数组的情况
     * 测试用例：三个元素的数组 [2,0,1]
     */
    @Test
    public void testSortColorsThreeElements() {
        Solution solution = new Solution();
        int[] nums = {2, 0, 1};
        int[] expected = {0, 1, 2};
        
        solution.sortColors(nums);
        assertArrayEquals(expected, nums);
    }
    
    /**
     * 测试目的：验证已排序数组的情况
     * 测试用例：已经排序的数组 [0,0,1,1,2,2]
     */
    @Test
    public void testSortColorsAlreadySorted() {
        Solution solution = new Solution();
        int[] nums = {0, 0, 1, 1, 2, 2};
        int[] expected = {0, 0, 1, 1, 2, 2};
        
        solution.sortColors(nums);
        assertArrayEquals(expected, nums);
    }
    
    /**
     * 测试目的：验证只有一种颜色的情况
     * 测试用例：全为0的数组 [0,0,0]
     */
    @Test
    public void testSortColorsAllZeros() {
        Solution solution = new Solution();
        int[] nums = {0, 0, 0};
        int[] expected = {0, 0, 0};
        
        solution.sortColors(nums);
        assertArrayEquals(expected, nums);
    }
    
    /**
     * 测试目的：验证只有两种颜色的情况
     * 测试用例：只有0和1的数组 [1,0,1,0]
     */
    @Test
    public void testSortColorsOnlyZeroAndOne() {
        Solution solution = new Solution();
        int[] nums = {1, 0, 1, 0};
        int[] expected = {0, 0, 1, 1};
        
        solution.sortColors(nums);
        assertArrayEquals(expected, nums);
    }
}

