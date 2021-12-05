--create datebase

SELECT * FROM Jaegers; --вывести всю таблицу
SELECT * FROM Jaegers WHERE status != 'Destroyed'; --отобразить только не уничтоженных роботов
SELECT * FROM Jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6'; --отобразить роботов нескольких серий, например Mark-1 и Mark-6
SELECT * FROM Jaegers ORDER BY mark DESC; --отсортировать таблицу по убыванию по столбцу mark
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers); --отобразить самого старого робота
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers); --отобразить роботов, которые уничтожили больше всех kaiju
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers); --отобразить роботов, которые уничтожили меньше всех kaiju
SELECT AVG(weight) FROM Jaegers; --отобразить средний вес роботов
UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'Survival'; --увеличить на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
DELETE FROM Jaegers WHERE status = 'Destroyed'; --удалить уничтоженных роботов