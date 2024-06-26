-- SQLBook: Code
-- tabla Usuario
CREATE TABLE
    Usuario (
        id_usuario SERIAL PRIMARY KEY,
        nombre VARCHAR(50) NOT NULL,
        apellido VARCHAR(50) NOT NULL,
        cedula BIGINT NOT NULL UNIQUE,
        direccion VARCHAR(100) NOT NULL,
        telefono BIGINT NOT NULL
    );

-- tabla Carro
CREATE TABLE
    Carro (
        id_carro SERIAL PRIMARY KEY,
        marca VARCHAR(50) NOT NULL,
        modelo VARCHAR(50) NOT NULL,
        color VARCHAR(20) NOT NULL,
        ciudad VARCHAR(50) NOT NULL,
        imagen TEXT NOT NULL,
        precio DECIMAL(10,2) NOT NULL
    );

-- tabla de prestamos
CREATE TABLE
    Prestamo (
        id_prestamo SERIAL PRIMARY KEY,
        usuario_id INT NOT NULL,
        carro_id INT NOT NULL,
        fecha_inicio DATE NOT NULL,
        fecha_fin DATE NOT NULL,
        CONSTRAINT fk_usuario FOREIGN KEY (usuario_id) REFERENCES Usuario (id_usuario),
        CONSTRAINT fk_carro FOREIGN KEY (carro_id) REFERENCES Carro (id_carro),
        CONSTRAINT ck_fechas CHECK (fecha_inicio <= fecha_fin)
    );