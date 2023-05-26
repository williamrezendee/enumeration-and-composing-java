package br.com.william.composition.exercise_1.application;

import br.com.william.composition.exercise_1.entities.Contract;
import br.com.william.composition.exercise_1.entities.Department;
import br.com.william.composition.exercise_1.entities.Worker;
import br.com.william.composition.exercise_1.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the name of the department: ");
        String departmentName = scanner.next();

        Department department = new Department(departmentName);

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = scanner.nextLine();
        System.out.print("Level: ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(scanner.next());
        System.out.print("Base Salary: ");
        Double workerBaseSalary = scanner.nextDouble();

        Worker worker = new Worker(workerName, workerLevel, workerBaseSalary, department);

        System.out.print("How many contracts the worker have? ");
        int numberOfContracts = scanner.nextInt();

        for (int i = 0; i < numberOfContracts; i++) {
            System.out.printf("Enter contract #%d data:%n", i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = dateFormat.parse(scanner.next());
            System.out.print("Value per hour: ");
            double contractValuePerHour = scanner.nextDouble();
            System.out.print("Duration (hours): ");
            int contractDurationInHours = scanner.nextInt();

            Contract contract = new Contract(contractDate, contractValuePerHour, contractDurationInHours);
            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");

        scanner.close();
    }
}
