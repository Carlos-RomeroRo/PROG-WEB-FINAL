-- SQLBook: Code
-- Insertar usuarios
INSERT INTO Usuario (nombre, apellido, cedula, direccion, telefono) VALUES 
('Carlos', 'Gómez', 1011122233, 'Carrera 7 #45-10, Bogotá', 3214567890),
('Laura', 'Mejía', 2023344556, 'Calle 9 #23-56, Medellín', 3105678901),
('Andrés', 'Rojas', 3034455667, 'Avenida 1 #12-34, Cali', 3006789012);

-- Insertar carros
INSERT INTO Carro (marca, modelo, color, ciudad) VALUES 
('Chevrolet', 'Spark', 'Rojo', 'Bogotá'),
('Renault', 'Logan', 'Blanco', 'Medellín'),
('Mazda', 'CX-5', 'Negro', 'Cali');

-- Insertar prestamos
INSERT INTO Prestamo (usuario_id, carro_id, fecha_inicio, fecha_fin) VALUES 
(1, 1, '2024-07-01', '2024-07-10'),
(2, 2, '2024-07-05', '2024-07-15'),
(3, 3, '2024-07-07', '2024-07-17');
