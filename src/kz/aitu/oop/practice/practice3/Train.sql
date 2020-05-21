CREATE TABLE 'train'
(
    'passengername' text NOT NULL,
    'id' int(11) NOT NULL,
    'cabin' int(11) NOT NULL,
    'seat' int(11) NOT NULL
)

INSERT INTO 'train'('passengername' ,'id','cabin','seat') VALUES
('Ridiculuc',1,5,20),
('PitrificusTotatus',2 ,3,11),
('LumusMaxima',3,6,23);

ALTER TABLE 'train'
  ADD PRIMARY KEY('id');

