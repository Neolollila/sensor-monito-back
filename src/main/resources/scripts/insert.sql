INSERT INTO users(id, user_name, password, email)
VALUES (1, 'Alex11', '$2a$10$lAaHcFUbAazeopqU26Tm1.7lrlHh2tNBhikGOI8Lhs5MrHkuciUZy',
        'alex200@gmail.com'),
       (2, 'Artsiom', '$2a$10$wgKbwRzyA54RY5oC97vwSuqJgdgr3cJxFZeAMdYoLSPhUwykPKPdW',
        'art222@gmail.com');

INSERT INTO sensor(id, name, model, range_from, range_to, type, unit, location, description)
VALUES (1, 'sensor1', 'SH-51', 11, 22, 'Pressure', 'bar', 'Room1', 'Great sensor1'),
       (2, 'sensor2', 'SH-52', 12, 22, 'Voltage', 'voltage', 'Room2', 'Great sensor2'),
       (3, 'sensor3', 'SH-53', 13, 23, 'Temperature', '°С', 'Room3', 'Great sensor3'),
       (4, 'sensor4', 'SH-54', 13, 23, 'Pressure', '°bar', 'Room6', 'Great sensor4'),
       (5, 'sensor5', 'SH-55', 13, 23, 'Humidity', '%', 'Room4', 'Great sensor5'),
       (6, 'sensor6', 'SH-56', 13, 23, 'Temperature', '°С', 'Room4', 'Great sensor6'),
       (7, 'sensor7', 'SH-57', 13, 23, 'Voltage', 'voltage', 'Room7', 'Great sensor7'),
       (8, 'sensor8', 'SH-58', 13, 23, 'Temperature', '°С', 'Room4', 'Great sensor8'),
       (9, 'sensor9', 'SH-59', 14, 24, 'Humidity', '%', 'Room1', 'Great sensor9');

INSERT INTO type(id, name)
VALUES (1, 'Pressure'),
       (2, 'Voltage'),
       (3, 'Temperature'),
       (4, 'Humidity');

INSERT INTO unit(id, name)
VALUES (1, 'bar'),
       (2, 'voltage'),
       (3, '°С'),
       (4, '%');

INSERT INTO roles(id, name)
VALUES (1, 'VIEWER'),
       (2, 'ADMINISTRATOR');

INSERT INTO user_roles(users_id, roles_id)
VALUES (1, '1'),
       (2, '2');
