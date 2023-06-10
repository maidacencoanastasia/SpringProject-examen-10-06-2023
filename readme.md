# Java Enterprise 


-- CREATE DATABASE examen;
-- USE examen;
--


-- CREATE TABLE if not exists carti (
-- 	 id INT PRIMARY KEY AUTO_INCREMENT,
--     ISBN VARCHAR(255) NOT NULL,
--     denumire VARCHAR(50) NOT NULL,
--     autor VARCHAR(30),
--     an_editie DATE,
--     editura VARCHAR(100),
--     nr_pagini INT
-- );
--



-- INSERT INTO Carti (ISBN, denumire, autor, an_editie, editura, nr_pagini) VALUES
-- ('ISBN1', 'Maitreyi', 'Mircea Eliade', '2002-01-01', 'Humanitas', 250),
-- ('ISBN2', 'Enigma Otiliei', 'George Călinescu', '1998-05-15', 'Litera', 320),
-- ('ISBN3', 'Morometii', 'Marin Preda', '1980-12-01', 'Editura Cartea Românească', 480);
--



-- INSERT INTO Carti (ISBN, denumire, autor, an_editie, editura, nr_pagini) VALUES
-- ('ISBN4', 'Преступление и наказание', 'Фёдор Достоевский', '1866-01-01', 'Петербургский вестник', 560),
-- ('ISBN5', 'Война и мир', 'Лев Толстой', '1869-01-01', 'Русский вестник', 1225);
--


-- English books
-- INSERT INTO Carti (ISBN, denumire, autor, an_editie, editura, nr_pagini) VALUES
-- ('ISBN6', 'To Kill a Mockingbird', 'Harper Lee', '1960-07-11', 'J. B. Lippincott & Co.', 324),
-- ('ISBN7', '1984', 'George Orwell', '1949-06-08', 'Secker & Warburg', 328),
-- ('ISBN8', 'Pride and Prejudice', 'Jane Austen', '1813-01-28', 'T. Egerton, Whitehall', 432),
-- ('ISBN9', 'Harry Potter and the Sorcerer''s Stone', 'J.K. Rowling', '1997-06-26', 'Bloomsbury Publishing', 320),
-- ('ISBN10', 'The Great Gatsby', 'F. Scott Fitzgerald', '1925-04-10', 'Charles Scribner''s Sons', 180);







-- Create the trigger
-- DELIMITER //
-- CREATE TRIGGER check_publication_year
-- BEFORE INSERT ON Carti
-- FOR EACH ROW
-- BEGIN
--     IF NEW.an_editie >= CURDATE() THEN
--         SIGNAL SQLSTATE '45000'
--         SET MESSAGE_TEXT = 'Publication year must be less than the current date.';
--     END IF;
-- END //
-- DELIMITER ;


--
INSERT INTO Carti (ISBN, denumire, autor, an_editie, editura, nr_pagini) VALUES
('ISBN10', 'The Great Gatsby', 'F. Scott Fitzgerald', '2024-04-10', 'Charles Scribner''s Sons', 180);