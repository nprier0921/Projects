import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(inputFile));
            writer = new BufferedWriter(new FileWriter(outputFile));

            writer.write("EmpID,PayRate,HoursWorked,WeeklyPay");
            writer.newLine();

            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split("\t");

                if (parts.length < 3) continue;

                String empId = parts[0].trim();

                double payRate = Double.parseDouble(parts[1].trim());
                double hoursWorked = Double.parseDouble(parts[2].trim());

                double weeklyPay;
                
                if (hoursWorked <= 40) {
                    weeklyPay = payRate * hoursWorked;
                } else {
                    double overtimeHours = hoursWorked - 40;
                    weeklyPay = (payRate * 40) + (overtimeHours * payRate * 1.5);
                }
                
                String formattedPay = String.format("$%.2f", weeklyPay);

                String outputLine = empId + "," + payRate + "," + hoursWorked + "," + formattedPay;

                writer.write(outputLine);
                writer.newLine();
            }

            System.out.println("Processing complete. Check output.csv.");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Data format error: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }
}