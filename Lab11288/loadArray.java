
/**
 * Review of Arrays
 * 
 * @author (Jameson Loewen) 
 * @version (11/28)
 */
public class loadArray
{
    private int numSize;
    private int[] nums;
    public loadArray(int arraySize)
    {
      numSize = arraySize;
      nums = new int[arraySize];
    }
    public void fillEven(){
        int evenNum = 2;
        for(int i = 0; i < nums.length; i++){
            nums[i] = evenNum;
            evenNum += 2;
        }
    }
    public void fillRandom(){
        for(int i = 0; i < nums.length; i++){
            int someNum = (int)(Math.random()*100);
            nums [i] = someNum;
        }
    }
}
