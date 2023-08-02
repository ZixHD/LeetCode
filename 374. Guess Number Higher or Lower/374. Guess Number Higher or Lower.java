/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long left = 1,right = n;
        while (left <= right)
        {
            int mid = (int)((right + left) / 2);
            int res = guess(mid);
            if (res == 0)  return mid;
            if (res < 0)   right = mid - 1;              // the number is greater than our guess
            if (res > 0)   left = mid + 1;
        }
        return -1;
    }
}
