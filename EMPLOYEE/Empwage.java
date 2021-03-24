public class Empwage {
	public static final double isfullTime = 1;
	public static final double ispartTime = 2;
	public static final double employeeRateperHr = 20;
	public static final double NumWorkingDays = 2;
        public static final double MaxHrinMonth= 10;

        public static void main(String[] args) {

  	double totalworkinDays=0;
	double totalEmpwge=0;
	double totalEmpHr=0;


 		while(totalEmpHr <= MaxHrinMonth && totalworkinDays < NumWorkingDays ) {
			double Emphr=0;
                      totalworkinDays++;

        double empCheck=Math.floor(Math.random() * 10) % 3;

	        switch ((int) empCheck)
                        {
		case 1:
			Emphr=8;
		break;

		case 2:
		        Emphr=4;
                break;

		default:
			Emphr=0;
			}
	        	 totalEmpHr += Emphr;
		        double empwage = Emphr * employeeRateperHr;
			 totalEmpwge += empwage;
			System.out.println("Emp wage:" +empwage);
			}
			System.out.println("Total Emp wage:" +totalEmpwge);
		}
}
