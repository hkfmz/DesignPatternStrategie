
public class Context {

private Strategie stg;

   public Context(Strategie stg) {
	   this.stg = stg;
   }
   
   public double executeStg(int num1, int num2) {
	   return stg.doOp(num1, num2);
   }

}
