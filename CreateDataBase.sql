CREATE TABLE ALEX.WEAPONS
(
	TypeWeapon VARCHAR(30),
	NameWeapon VARCHAR(30) PRIMARY KEY, 
	WeightWeapon DOUBLE,
	LengthWeapon DOUBLE,
	CaliberWeapon DOUBLE,
	SpeadWeapon DOUBLE
);

INSERT INTO ALEX.WEAPONS VALUES('Револьвер', 'Энфилд МК 2', 1100, 292, 12.1, 213);
INSERT INTO ALEX.WEAPONS VALUES('Револьвер', 'Керра (№27)', 1200, 279, 11.2, 168);
INSERT INTO ALEX.WEAPONS VALUES('Пистолет', 'Бернарделли Р018', 100, 213, 9, 350);
INSERT INTO ALEX.WEAPONS VALUES('Пистолет', 'Беретта, модель 81', 700, 171, 7.65, 300);
INSERT INTO ALEX.WEAPONS VALUES('Автомат', 'АК-47', 4300, 880, 7.62, 717); 