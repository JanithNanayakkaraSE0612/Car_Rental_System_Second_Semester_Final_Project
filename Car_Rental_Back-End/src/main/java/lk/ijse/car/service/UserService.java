package lk.ijse.car.service;

import com.easy.car_rental.dto.UserDTO;

import java.util.ArrayList;


public interface UserService {
    ArrayList<UserDTO> getAllRegUsers();

    UserDTO getRegUsers(String username,String password);

}
