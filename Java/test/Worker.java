public class Worker

{

private double hourlyRate;

private double hoursWorked;

private double earnings;

public Worker(double rate, double hours)

{

hourlyRate = rate;

hoursWorked = hours;

}

private void calculateEarnings()

{
System.out.println("ran");
earnings = 0;

earnings += hourlyRate * hoursWorked;

}

public double getEarnings()

{

calculateEarnings();

return earnings;

}

}