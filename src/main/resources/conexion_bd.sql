create role userdba with password '123456';
create database transporte_quimico_db owner userdba;
ALTER ROLE userdba LOGIN;

INSERT INTO conductor (cedula, nombre, apellido, correo, fecha_registro) VALUES (123456789, 'Juan', 'Pérez', 'juan.perez@email.com', '2025-04-06 10:30:00');
INSERT INTO conductor (cedula, nombre, apellido, correo, fecha_registro) VALUES (987654321, 'María', 'González', 'maria.gonzalez@email.com', '2025-04-06 14:15:00');
INSERT INTO conductor (cedula, nombre, apellido, correo, fecha_registro) VALUES (456789123, 'Carlos', 'Ramírez', 'carlos.ramirez@email.com', '2025-04-06 09:45:00');


{
  "cedula": 2002002002,
  "nombre": "Felipe",
  "apellido": "Martínez",
  "correo": "felipe.martinez@email.com"
}

{
  "cedula": 3003003003,
  "nombre": "Sofía",
  "apellido": "García",
  "correo": "sofia.garcia@email.com"
}


{
  "cedula": 4004004004,
  "nombre": "Andrés",
  "apellido": "Torres",
  "correo": "andres.torres@email.com"
}
