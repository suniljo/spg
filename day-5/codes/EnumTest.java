enum Subject
{
  JAVA, C, CPP, ANDROID
}

class EnumTest 
{
public static void main(String[] args) 
{
 Subject sub = Subject.JAVA; 

 System.out.println(sub);//JAVA

 switch(sub){
   case JAVA:
	System.out.println("Selected for Java");
	break;
   case C:
    System.out.println("Selected for C");
	break;
   case CPP:
	System.out.println("Selected for C++");
	break;
   default:
	System.out.println("Selected for Mobile Apps");
	break;
  }
  System.out.println(Subject.valueOf("JAVA"));
 }
}
