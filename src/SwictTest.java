package home.trial.ds;

public class SwictTest {
  public static void main(String[] args) {
    int x =0;
    int []nums ={1,2,3,5};
    for(int i : nums){
      switch(i){
      case 1:
        x+=i;
        break;
      case 5:
        x+=i;
        break;
      default:
        x+=i;
        break;
      case 2:
        x+=i;
        break;
      }
    }
    System.out.println(x);
  }
}
