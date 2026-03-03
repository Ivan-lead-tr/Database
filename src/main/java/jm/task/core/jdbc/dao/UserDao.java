package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.util.List;

public interface UserDao {
    void createUsersTable(); // Создание таблицы

    void dropUsersTable(); // Удаление юзеров

    void saveUser(String name, String lastName, byte age); // Сохранение юзеров

    void removeUserById(long id); // Удаление пользователей по id

    List<User> getAllUsers(); // получение доступа ко всем

    void cleanUsersTable(); // Очистить таблицу юзеров
}
