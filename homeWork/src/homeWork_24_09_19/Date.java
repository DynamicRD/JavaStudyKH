package homeWork_24_09_19;

public class Date {
	private int year;
	private int month;
	private int day;
	private String monthName;
	public Date() {
	}
	public Date(int year, int month, int day) {
		this.year = year;
		if(month <1 || month>12)
		{
			System.out.println("월 오류");
			return;
		}
		this.month = month;
	    switch (month) {
        case 1:
            monthName = "January";
            break;
        case 2:
            monthName = "February";
            break;
        case 3:
            monthName = "March";
            break;
        case 4:
            monthName = "April";
            break;
        case 5:
            monthName = "May";
            break;
        case 6:
            monthName = "June";
            break;
        case 7:
            monthName = "July";
            break;
        case 8:
            monthName = "August";
            break;
        case 9:
            monthName = "September";
            break;
        case 10:
            monthName = "October";
            break;
        case 11:
            monthName = "November";
            break;
        case 12:
            monthName = "December";
            break;
    }
		if(day<1 || day>31)
		{
			System.out.println("날짜 오류");
			return;
		}else if(day==31 && (month == 11||month == 9||month == 6||month == 4||month == 2))
		{
			System.out.println("날짜 오류");
			return;			
		}else if(day>=29 && month == 2 && year % 4 != 0)
		{
			System.out.println("날짜 오류");
			return;						
		}
			
		this.day = day;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month <1 || month>12)
		{
			System.out.println("월 오류");
			return;
		}
		this.month = month;
	    switch (month) {
        case 1:
            monthName = "January";
            break;
        case 2:
            monthName = "February";
            break;
        case 3:
            monthName = "March";
            break;
        case 4:
            monthName = "April";
            break;
        case 5:
            monthName = "May";
            break;
        case 6:
            monthName = "June";
            break;
        case 7:
            monthName = "July";
            break;
        case 8:
            monthName = "August";
            break;
        case 9:
            monthName = "September";
            break;
        case 10:
            monthName = "October";
            break;
        case 11:
            monthName = "November";
            break;
        case 12:
            monthName = "December";
            break;
    }
	}
	public int getDay() {
		
		return day;
	}
	public void setDay(int day) {
		if(month<1 || month>12)
		{
			System.out.println("월부터 설정하세요");
			return;
		}
		
		if(day<1 || day>31)
		{
			System.out.println("날짜 오류");
			return;
		}else if(day==31 && (month == 11||month == 9||month == 6||month == 4||month == 2))
		{
			System.out.println("날짜 오류");
			return;			
		}else if(day>=29 && month == 2 && year % 4 != 0)
		{
			System.out.println("날짜 오류");
			return;						
		}
			
		this.day = day;
	}
	
	public void print1()
	{
		System.out.println(year+"."+month+"."+day);
	}
	
	public void print2()
	{
		System.out.println(monthName+" "+day+", "+year);
	}
	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + ", monthName=" + monthName + "]";
	}
	

}
