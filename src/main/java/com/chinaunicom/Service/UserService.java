package com.chinaunicom.Service;

import com.chinaunicom.model.User;

public interface UserService {
    /**
     *
     * @param id
     * @return
     */
    User selectById(int id);

}
