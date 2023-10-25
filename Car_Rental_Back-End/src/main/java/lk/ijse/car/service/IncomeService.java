package lk.ijse.car.service;

import com.easy.car_rental.dto.IncomeDTO;

import java.util.ArrayList;

public interface IncomeService {
    ArrayList<IncomeDTO> dailyIncome();
    ArrayList<IncomeDTO> monthlyIncome();
    ArrayList<IncomeDTO> AnnuallyIncome();
}
