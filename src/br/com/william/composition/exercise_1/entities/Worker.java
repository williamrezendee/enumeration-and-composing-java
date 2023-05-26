package br.com.william.composition.exercise_1.entities;

import br.com.william.composition.exercise_1.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Worker {
    private final String name;
    private final WorkerLevel level;
    private final Double baseSalary;

    private Department department;
    private List<Contract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public WorkerLevel getLevel() {
        return this.level;
    }

    public Double getBaseSalary() {
        return this.baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void addContract(Contract contract) {
        contracts.add(contract);
    }

    public void removeContract(Contract contract) {
        contracts.remove(contract);
    }

    public double income(Integer year, Integer month) {
        double sum = getBaseSalary();
        Calendar calendar = Calendar.getInstance();

        for (Contract contract : contracts) {
            calendar.setTime(contract.getDate());
            int contractYear = calendar.get(Calendar.YEAR);
            int contractMonth = calendar.get(Calendar.MONTH);
            if (contractYear == year && contractMonth == month) {
                sum += contract.totalValue();
            }
        }

        return sum;
    }
}
