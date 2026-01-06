import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double TotalMarks = 0 ;
        System.out.println("Enter number of subjects :");
        int subjects = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1 ; i <= subjects; i++) {
        System.out.println("Enter subject name :");
        String subject = scanner.nextLine();
        System.out.println("Enter subject marks :");
        int marks = scanner.nextInt();

        TotalMarks += marks ;
        }

    double percentage = (TotalMarks / (subjects * 100)) * 100 ;
    System.out.println("Total Marks :" + TotalMarks);
    System.out.println("Percentage :" + percentage);

    int Grade = (int) (percentage / 10);

    switch (Grade) {
        case 10 :
            case 9 :
                System.out.println("Grade A");
                break;
                case 8 :
                    System.out.println("Grade B");
                    break;
                    case 7 :
                        System.out.println("Grade C");
                        break;
                        case 6 :
                            System.out.println("Grade D");
                            break;
                            case 5 :
                                default :
                                System.out.println("Grade F");
} } }