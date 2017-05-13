   INSERT INTO users (id, name, lastname, email, pass) VALUES (0,'Armin', 'Aguilar', 'armin@gmail.com', '12340');
   INSERT INTO users (id, name, lastname, email, pass) VALUES (1,'Josue', 'Espadas', 'espadas@gmail.com', '00000');

   INSERT INTO profiles (id, description, actuators ) VALUES ( 0,'Día Lluvioso', 'valores');
   INSERT INTO profiles (id, description, actuators ) VALUES ( 1,'Día Soleado', 'valores');
   INSERT INTO profiles (id, description, actuators ) VALUES ( 2,'Noche', 'valores');
   INSERT INTO profiles (id, description, actuators ) VALUES (3,'Atardecer', 'valores');

    INSERT INTO users_profile (id_user, id_profile ) VALUES ( 0, 1);
    INSERT INTO users_profile (id_user, id_profile ) VALUES ( 0, 2);
    INSERT INTO users_profile (id_user, id_profile ) VALUES ( 1, 0);
    INSERT INTO users_profile (id_user, id_profile ) VALUES ( 1, 3);