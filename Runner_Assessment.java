import javax.swing.JOptionPane;

/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 */
public class Runner_Assessment {

    public static void main(String[] args)
    {
        String input;
        int questions = 0;
        int missed = 0;

        try {
            input = JOptionPane.showInputDialog("How many questions are on the exam?");
            questions = Integer.parseInt(input);

            if (questions <= 0) {
                throw new ArithmeticException("Number of questions must be greater than 0.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.");
            System.exit(0);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }

        try {
            input = JOptionPane.showInputDialog("How many questions did the student miss?");
            missed = Integer.parseInt(input);

            if (missed < 0 || missed > questions) {
                throw new IllegalArgumentException("Missed questions must be between 0 and total questions.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.");
            System.exit(0);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }

        Exam exam = new Exam(questions, missed);

        String message = "Each question counts " + exam.getPointsEach();
        message += " points.\nThe exam score is " + exam.getScore();
        message += "\nThe exam grade is " + exam.getGrade();

        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}