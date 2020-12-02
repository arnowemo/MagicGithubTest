package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.List;


import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

public class FakeApiService implements ApiService {

    private List<User> users = generateUsers();

    /**
     * Retourne une liste d'utilisateurs
     * les utilisateurs sont générés par FakeApiServiceGenerator
     */
    @Override
    public List<User> getUsers() {

        return users;

    }

    /**
     * Génére un utilisateur aléatoire et l'ajoute a la liste users.
     * Cet utilisateur provient de la liste FAKE_USERS_RANDOM.
     */
    @Override
    public void generateRandomUser() {

        users.add(User.random());

    }

    /**
     * Supprime un utilisateur de la liste.
     */
    @Override
    public void deleteUser(User user) {

        users.remove(user);

    }
}
