DROP TABLE IF EXISTS test_entity;

CREATE TABLE test_entity (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  attribute VARCHAR(250) NOT NULL
);

INSERT INTO test_entity (attribute) VALUES
('test1'),
('test2'),
('test3');
