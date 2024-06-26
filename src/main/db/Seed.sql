-- SQLBook: Code
-- Insertar usuarios
INSERT INTO Usuario (nombre, apellido, cedula, direccion, telefono) VALUES 
('Carlos', 'Gómez', 1011122233, 'Carrera 7 #45-10, Bogotá', 3214567890),
('Laura', 'Mejía', 2023344556, 'Calle 9 #23-56, Medellín', 3105678901),
('Andrés', 'Rojas', 3034455667, 'Avenida 1 #12-34, Cali', 3006789012);

-- Bogotá, Medellín, Cali, Barranquilla, Cartagena, Santa Marta, Pereira, Cúcuta, Sincelejo
-- Insertar carros
INSERT INTO carro (marca, modelo, color, ciudad, imagen, precio) VALUES
('Toyota', 'Corolla', 'Rojo', 'Bogotá', 'https://th.bing.com/th/id/OIP.biwUDAgY2oqebC3-YgcgHwAAAA?rs=1&pid=ImgDetMain',20000),
('Ford', 'Fiesta', 'Azul', 'Bogotá', 'https://th.bing.com/th/id/R.60f97358eee734d69ab73b8c2f702187?rik=0vHBDSwDHDzTtQ&pid=ImgRaw&r=0',40000),
('Chevrolet', 'Aveo', 'Negro', 'Bogotá', 'https://www.chevrolet.com.mx/content/dam/chevrolet/na/mx/es/index/cars/2020-aveo/colorizer/01-images/negro-grafito-metalico.jpg?imwidth=1200',50000),
('Renault', 'Logan', 'Blanco', 'Bogotá', 'https://th.bing.com/th/id/OIP.7Z2IQbSOD_1U8BJl8OkwfAHaEK?rs=1&pid=ImgDetMain',30000),
('Nissan', 'Sentra', 'Gris', 'Bogotá', 'https://http2.mlstatic.com/D_NQ_NP_640785-MLU47352857360_092021-O.webp',25000),
('Kia', 'Rio', 'Negro', 'Medellín', 'https://th.bing.com/th/id/OIP.IZvkseNvi9llMwi_dshwqQHaDt?w=680&h=340&rs=1&pid=ImgDetMain',35000),
('Mazda', '3', 'Rojo', 'Medellín', 'https://th.bing.com/th/id/OIP.If2aTh-UNyvafJiVAKfhSwHaEK?rs=1&pid=ImgDetMain',40000),
('Hyundai', 'Tucson', 'Blanco', 'Medellín', 'https://th.bing.com/th/id/OIP.1TksROyA3L12w9exTsvQVgHaEK?rs=1&pid=ImgDetMain',45000),
('Honda', 'Civic', 'Azul', 'Medellín', 'https://www.elcarrocolombiano.com/wp-content/uploads/2019/11/20191116-HONDA-CIVIC-2020-COLOMBIA-PRECIO-CARACTERISTICAS-01AA.jpg',50000),
('Volkswagen', 'Golf', 'Negro', 'Medellín', 'https://www.hdwallpapers.in/download/black_volkswagen_golf_gtd_2020_4k_5k_hd_cars-5120x2880.jpg',33000),
('Audi', 'A4', 'Blanco', 'Cali', 'https://th.bing.com/th/id/OIP.-1W6amUE8gusu_NzbogZAAHaE8?w=750&h=500&rs=1&pid=ImgDetMain',21000),
('BMW', 'Serie 3', 'Azul', 'Cali', 'https://estaticos-cdn.sport.es/clip/40123679-6759-48dc-ab3b-5e6a49bbdcc2_alta-libre-aspect-ratio_default_0.jpg',45000),
('Mercedes-Benz', 'Clase C', 'Gris', 'Cali', 'https://mercedes-export.co.uk/wp-content/uploads/2020/02/88.jpg',38000),
('Subaru', 'Impreza', 'Rojo', 'Cali', 'https://th.bing.com/th/id/OIP.4twqAbMZSDtnsiridkoxTQHaEo?rs=1&pid=ImgDetMain',22000),
('Peugeot', '208', 'Negro', 'Cali', 'https://th.bing.com/th/id/OIP.3o2i3uwS0f8uAtfeI7l34QHaEK?rs=1&pid=ImgDetMain',35000),
('Fiat', '500', 'Blanco', 'Barranquilla', 'https://www.nitro.pe/images/2016/junio/fiat_500_blanco.jpg',28000),
('Alfa Romeo', 'Giulia', 'Rojo', 'Barranquilla', 'https://www.fullertonalfaromeo.com/static/dealer-14688/918086.jpg',50000),
('Porsche', '911', 'Azul', 'Barranquilla', 'https://th.bing.com/th/id/R.365acfcef994ee1349a2207c861381cd?rik=Cl3HKcG2Zf2UHw&riu=http%3a%2f%2fwww.karlbrauer.com%2fwp-content%2fuploads%2f2018%2f11%2f2017-Porsche-911-Turbo-S-Front-Miami-Blue.jpg&ehk=jAbi8wMt29HjEnHvfyn1tmTiwwSHyWUvMssfYvd2dqs%3d&risl=1&pid=ImgRaw&r=0',45000),
('Lexus', 'IS', 'Negro', 'Barranquilla', 'https://th.bing.com/th/id/R.849b3873bdd6a0e1e085bef8b1778e62?rik=b0JG180JdhZfgQ&pid=ImgRaw&r=0',30000),
('Jaguar', 'XE', 'Blanco', 'Barranquilla', 'https://carsguide-res.cloudinary.com/image/upload/f_auto%2Cfl_lossy%2Cq_auto%2Ct_default/v1/editorial/review/hero_image/20MY%20Jaguar%20XE%20P300%20R-Dynamic%20HSE%20Fuji%20White%2000002.jpg',40000),
('Land Rover', 'Discovery', 'Gris', 'Cartagena', 'https://th.bing.com/th/id/R.52c684b67dd15fb2b00fd1f82f25204a?rik=Ddhe0UKaLzIjhg&pid=ImgRaw&r=0',38000),
('Mitsubishi', 'Lancer', 'Rojo', 'Cartagena', 'https://c4.wallpaperflare.com/wallpaper/894/916/834/mitsubishi-lancer-evolution-mitsubishi-lancer-mitsubishi-lancer-evolution-ix-hd-wallpaper-preview.jpg',30000),
('Dodge', 'Charger', 'Negro', 'Cartagena', 'https://th.bing.com/th/id/OIP.dQ26AIKNe5QfNwTXK1SoZgHaE8?rs=1&pid=ImgDetMain',38000),
('Chrysler', '300', 'Blanco', 'Cartagena', 'https://th.bing.com/th/id/R.58456b8ed256e51ebd2e381b9c497a63?rik=mlHLXjwn%2bw7iCA&pid=ImgRaw&r=0',40000),
('Mitsubishi', 'Lancer', 'Rojo', 'Cartagena', 'https://th.bing.com/th/id/OIP.ixJ9NQsms9C2FquT3-nvzQHaE8?rs=1&pid=ImgDetMain',30000),
('Jeep', 'Wrangler', 'Azul', 'Santa Marta', 'https://th.bing.com/th/id/OIP.XKWqug7_Sst62SspS7rEjwHaEK?rs=1&pid=ImgDetMain',35000),
('Dodge', 'Charger', 'Negro', 'Santa Marta', 'https://th.bing.com/th/id/OIP.4YYChzDY9-iVHXStOevKHQAAAA?rs=1&pid=ImgDetMain',38000),
('Chrysler', '300', 'Blanco', 'Santa Marta', 'https://th.bing.com/th/id/R.bb05a4c99de9bc172e73ed934d34a2ab?rik=k12tMRFgxMfR%2fw&riu=http%3a%2f%2fimages.gtcarlot.com%2fpictures%2f93173232.jpg&ehk=xi%2bt%2beVuIK6Iiu%2bK3XQ5KGQYpritkHHD2zXqbwO1m7o%3d&risl=&pid=ImgRaw&r=0',40000),
('Volvo', 'S60', 'Rojo', 'Santa Marta', 'https://th.bing.com/th/id/OIP.oe6wrea44NHvdB3_F07d-wHaEK?rs=1&pid=ImgDetMain',30000),
('Infiniti', 'Q50', 'Azul', 'Santa Marta', 'https://i.ytimg.com/vi/Av_Ed5-fMlg/maxresdefault.jpg',40000),
('Cadillac', 'ATS', 'Negro', 'Pereira', 'https://th.bing.com/th/id/OIP.GC-12AyQm_EslkKWIjRIEQHaE8?rs=1&pid=ImgDetMain',38000),
('Lincoln', 'MKZ', 'Blanco', 'Pereira', 'https://mundicoche.com/wp-content/uploads/2022/08/White_2020_Lincoln_MKZ_front_view_Via_Lincoln.jpg',40000),
('Tesla', 'Model 3', 'Rojo', 'Pereira', 'https://th.bing.com/th/id/OIP.hJ4_P9tktrt_la95jiunoQHaFI?rs=1&pid=ImgDetMain',38000),
('Mini', 'Cooper', 'Azul', 'Pereira', 'https://th.bing.com/th/id/R.bad07c56bf736126d7027c72c7b32072?rik=WYB4OTdXFc8xnA&riu=http%3a%2f%2fwww.dragtimes.com%2fimages%2f27075-2013-Mini-.jpg&ehk=bF86WtyiJ%2fzOBqrKUv9Rngd8XacoHAcwQYeyGF6h81E%3d&risl=&pid=ImgRaw&r=0',40000),
('Smart', 'Fortwo', 'Negro', 'Pereira', 'https://cdn77.motor.es/fotos-noticias/2018/10/min652x435/smart-fortwo-edition-pureblack-201850664_3.jpg',22000),
('Ferrari', '488', 'Rojo', 'Cúcuta', 'https://th.bing.com/th/id/OIP.a1PcOuCgMBY98iBP58kN_QHaE7?rs=1&pid=ImgDetMain',26000),
('Lamborghini', 'Huracán', 'Blanco', 'Cúcuta', 'https://th.bing.com/th/id/OIP.F9wFmlkXLCzv5ce0j8iGvgHaEo?rs=1&pid=ImgDetMain',25000),
('Maserati', 'Ghibli', 'Gris', 'Cúcuta', 'https://th.bing.com/th/id/OIP.P2NMtb-VWmbg_oC-plSvVwHaEK?rs=1&pid=ImgDetMain',27500),
('Bentley', 'Continental', 'Azul', 'Cúcuta', 'https://th.bing.com/th/id/R.e53efbf0fa5801564585da5492da4121?rik=%2b89vYSrgcVsGYg&riu=http%3a%2f%2fimag.hedonistas.com%2farticulos%2fel-descapotable-de-cuatro-plazas-mas-rapido-del-mundo-en-color-azul.jpg&ehk=CGHgC1%2bKh%2f1ReCoU0S4EhI7s%2fQc4ZyVSSs6lb%2byyJLw%3d&risl=&pid=ImgRaw&r=0',28000),
('Aston Martin', 'DB11', 'Negro', 'Cúcuta', 'https://autoproyecto.com/wp-content/uploads/2020/03/Aston-Martin-DB11-Shadow-Edition-8.jpg',30000),
('Rolls-Royce', 'Ghost', 'Blanco', 'Tumaco', 'https://th.bing.com/th/id/OIP.Bl6Ad6-Y70hfEcfEzWYY3wHaE8?rs=1&pid=ImgDetMain',50000),
('McLaren', '570S', 'Rojo', 'Sincelejo', 'https://img.remediosdigitales.com/6bfcfe/mclaren-design-edition-01/1366_2000.jpeg',60000),
('Bugatti', 'Chiron', 'Azul', 'Sincelejo', 'https://th.bing.com/th/id/R.59743c4e991eac61d300370d21a53324?rik=gkPaNGegkJdgMg&pid=ImgRaw&r=0',40000),
('Pagani', 'Huayra', 'Negro', 'Sincelejo', 'https://th.bing.com/th/id/R.c8cc519a6d414b64d7930e715b3892de?rik=vhREkHcwWMUAFw&riu=http%3a%2f%2ffullhdwall.com%2fwp-content%2fuploads%2f2017%2f09%2fBlack-Pagani-Huayra.jpg&ehk=fPjdbRmo%2bMBdqMCsKD3xaCJJEWmQMrt8jxYdbSer%2feE%3d&risl=&pid=ImgRaw&r=0',80000),
('Koenigsegg', 'Agera', 'Blanco', 'Sincelejo', 'https://th.bing.com/th/id/OIP.gcCmbpNTLrHmjUky64iRpwHaE8?rs=1&pid=ImgDetMain',44000),
('Lotus', 'Elise', 'Gris', 'Sincelejo', 'https://th.bing.com/th/id/OIP.lRzYPmTU0ZEgF3z-hKhPlwHaDm?rs=1&pid=ImgDetMain',32000),
('GMC', 'Sierra', 'Rojo', 'Turbo', 'https://th.bing.com/th/id/OIP.TG358zO5x_ujyz_4Xn8NEAAAAA?rs=1&pid=ImgDetMain',45000),
('Chevrolet', 'Camaro', 'Azul', 'Maicao', 'https://wallpaperaccess.com/full/447844.jpg',50000),
('Ford', 'Mustang', 'Negro', 'Arjona', 'https://wallpapercave.com/wp/wp4384030.jpg',55000),
('Dodge', 'Viper', 'Blanco', 'El Banco', 'https://th.bing.com/th/id/OIP.cBwQWVRGMe13Ib4A1UBi9gHaE8?rs=1&pid=ImgDetMain',60000),
('Toyota', 'Supra', 'Rojo', 'Fusagasugá', 'https://th.bing.com/th/id/R.b0284d6e76b91179b180a5897c5e9244?rik=y00LCTabxplkCg&riu=http%3a%2f%2fwww.hongliyangzhi.com%2fmanufacturers%2ftoyota%2ftoyota-supra%2ftoyota-supra-red%2ftoyota-supra-red-1.jpg&ehk=Q4Em0Fn4EDAR8uauOpQPZT8va1x0fAqcbxnqdraQDw8%3d&risl=&pid=ImgRaw&r=0',70000),
('Nissan', 'GT-R', 'Azul', 'Sahagún', 'https://th.bing.com/th/id/OIP.zpsXnaqriP-Lrk7FCVB9MwHaEK?rs=1&pid=ImgDetMain',65000),
('Honda', 'NSX', 'Negro', 'Chiquinquirá', 'https://i.pinimg.com/originals/ae/d4/24/aed424513e515eda33ce5d3cfd560ef4.jpg',30000);


-- Insertar prestamos
INSERT INTO Prestamo (usuario_id, carro_id, fecha_inicio, fecha_fin) VALUES 
(1, 1, '2024-07-01', '2024-07-10'),
(2, 2, '2024-07-05', '2024-07-15'),
(3, 3, '2024-07-07', '2024-07-17');
