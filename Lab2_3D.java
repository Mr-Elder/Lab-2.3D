// ************************************************************************
//   LabGrade.java
//
//   This program computes a student's lab grade from
//   the grades on the three components of lab:  the pre-lab
//   assignment, the lab itself, and the post-lab assignment.
// ***********************************************************************
import static java.lang.System.out;
import java.text.DecimalFormat;
import java.text.NumberFormat;


class Lab2point3D
{
    public static void main (String[] args)
    {
    	
   	DecimalFormat format = new DecimalFormat("0.###");
	// Declare constants
	 double inWeight = 0.6;  // in-class weight is 60%
	 double outWeight = 0.4; // out-of-class weight is 40%

	// Declare variables
	double preLabPts;    //number of points earned on the pre-lab assignment
	double preLabMax;    //maximum number of points possible for pre-lab
	double labPts;       //number of poitns earned on the lab
	double labMax;       //maximum number of points possible for lab
	double postLabPts;   //number of points earned on the post-lab assignment
	double postLabMax;   //maximum number of points possible for the post-lab
	double outClassAvg;  //average on the out of class (pre and post) work
	double inClassAvg;   //average on the in-class work
	double labGrade;  //final lab grade
	
	// Get the input	
	GetInfo.showMessage("\nWelcome to the Lab Grade Calculator\n");
	preLabPts = GetInfo.getInt("Enter the number of points you earned on the pre-lab: ");
	preLabMax = GetInfo.getInt("What was the maximum number of points you could have earned? ");
	labPts = GetInfo.getInt("Enter the number of points you earned on the lab: ");
	labMax = GetInfo.getInt("What was the maximum number of points for the lab? ");
	postLabPts = GetInfo.getInt("Enter the number of points you earned on the post-lab: ");
	postLabMax = GetInfo.getInt("What was the maximum number of points for the post-lab? ");
	inWeight = GetInfo.getDouble("Enter the in class weight in decimal form:");
	
	// Calculate the average for the out of class work
	outClassAvg = (((100 / preLabMax) * preLabPts) + ((100/ postLabMax) * postLabPts))/2;
	
	// Calculate the average for the in-class work
	inClassAvg = (100.0 / (labMax * 1.0)) * labPts;
	
	// Calculate the weighted average taking 40% of the out-of-class average
	// plus 60% of the in-class 
	labGrade = outWeight * outClassAvg + inWeight * inClassAvg;
	
	// Print the results
	GetInfo.showMessage("Your average on out-of-class work is " +format.format(outClassAvg) + "%"); 
	GetInfo.showMessage("Your average on in-class work is " + format.format(inClassAvg) + "%");
	GetInfo.showMessage("Your lab grade is " + format.format(labGrade) + "%");
	
    }
}


