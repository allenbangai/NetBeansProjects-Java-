package chapter5exercises;
import java.util.*;
/**
   This code will help you calculate your sequence or semester result using the 
 * coeficients or credit value of your respective subjects or courses and can help 
 * you calculate you overall GPA of the semester or the overall average of the term
 * 
 * For this code to run to you satisfaction, you will have to enter accondinly 
 * and orderly the imformation required when you are being asked. 
 * Take note if the imformation are note well inputed, the required output will be outered
 * @author DELL
 */
public class exercise001 {

    /**
     * https://youtu.be/Kkti68UVkco
     * https://youtu.be/VB9CPSm-Hfg
     * https://biennesoft-youtube-downloader.en.uptodown.com/windows/download
     * https://y2mate.com
     * https://www.pdfdrive.com4
     * https://youtu.be/zSp10NY1zzk
     * https://www.afterschoolafrica.com/13726/dennis-and-lenora-foretia-foundation-stem-prize/
     * english , math,
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner allen= new Scanner(System.in);
        Scanner input= new Scanner(System.in);
        
        System.out.println("Howmany courses do you offer(note that, you should have marks in all the courses entered)?");
        int num3= allen.nextInt();
        System.out.printf("\n\n");
              
        System.out.println("Enter the name of the courses(there can be abbreviations) and their respective credit value");
        String[] str1 = new String[num3];
        int[] num5=  new int[num3];
        int num6=0;
        for(int i=0; i<num3; i++){
            str1[i]=input.nextLine();System.out.print("   ");
            num5[i] = allen.nextInt();
            num6 = num6 + num5[i]; 
        }      
        System.out.printf("\n\n");
            
        for(int j=0; j>=0; j--){
            System.out.println("if you want to imput your Continous Assesment Result and Exam Result, input 1");
            System.out.println("if you want to imput you Semester Result, ,input 2");
            System.out.println("If you want to enter your Grades to have your GPA, input 3");
            int num1 = allen.nextInt();
            System.out.printf("\n\n");
            
            int num9=0;
            switch(num1){
                case 1:
                    System.out.println("enter your continous asssesment and exam marks respectively");
                    double[] num2 = new double[num3];
                    double[] num4 = new double[num3];
                    for(int i=0; i<num3; i++){
                        System.out.printf("%s    %d    ",str1[i],num5[i]);
                        num2[i] = allen.nextDouble(); System.out.print("    ");
                        num4[1] = allen.nextDouble(); System.out.printf("\n");                                                       
                    }
                    double[] num7 = new double[num3];
                    for(int i=0; i<num3; i++){
                        num7[i] = num2[i] + num4[i];
                    }
                    System.out.printf("\n\n");
                    break; 
                case 2:
                    double[] num8 = new double[num3];
                    System.out.println("Enter your semester marks for each course(note that your marks should be on 100)");
                    for(int i=0; i<num3; i++){
                        System.out.printf("%s    %d",str1[i], num5[i]);
                        num8[i] = allen.nextDouble();
                    }
                    System.out.printf("\n\n");
                    break;
                case 3:
                    System.out.println("Enter the Grade you had in your respective courses4");
                    char[] ch = new char[num3];
                    for(int i=0; i<num3; i++){
                        System.out.printf("%s    %d    ",str1[i], num5[i]);
                        ch[i] = input.next().charAt(0);
                    }
                    System.out.printf("\n\n");
                    break;
                default:
                    System.out.println("wrong input, enter the correct value");
                    num9++;
            }
            if(num9==1){
                j++;
                num9--;
            }
            else{
            }
        }
    }    
}
