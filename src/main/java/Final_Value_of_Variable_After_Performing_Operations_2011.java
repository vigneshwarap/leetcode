/**
 * @author vpalanisamy
 * Jul 17, 2023
 */
public class Final_Value_of_Variable_After_Performing_Operations_2011
{
    public static int finalValueAfterOperations(String[] operations) {
        int cnt=0;
        for(String operation : operations){
            if (operation.charAt(1) == '+') {
                cnt++;
            }
            else {
                cnt--;
            }

        }
        return cnt;
    }

    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
}
