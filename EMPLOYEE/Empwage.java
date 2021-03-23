public class Empwage {

        public static void main(String[] args) {
        double isfullTime=1;
	double ispartTime=2;
	double partempHr=4;
        double fullempHr=8;
        double employeeRateperHr=20;
        double empwage;
        double empCheck=Math.floor(Math.random() * 10) %3;
	        switch ((int) empCheck) 
                        {
		case 1:
			if 
			(empCheck == isfullTime){
			empwage=fullempHr*employeeRateperHr;
			System.out.println("FullTime:" +empwage);}
		break;

		case 2:
			if 
			(empCheck == ispartTime){
		        empwage=partempHr*employeeRateperHr;
                        System.out.println("PartTime:" +empwage);}
                break;

		default: 
			{
			System.out.println("absent");}
			}
		}
}
