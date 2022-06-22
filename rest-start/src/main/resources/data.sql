insert into user_dbo(id, first_name, last_name, pesel) values
  (1, 'Jan', 'Kowalski', '90101222457'),
  (2, 'Maciej', 'Zalewski', '87112242456'),
  (3, 'Aneta', 'Korczyńska', '76061536749'),
  (4, 'Wojciech', 'Sokolik', '82010877245');

  insert into assignment(id, start, end, asset_id, user_id) values
    (1, '2017-10-08 15:00:00', '2018-10-08 15:00:00', 1, 1),
    (2, '2018-10-09 12:00:00', null, 5, 1),
    (3, '2018-10-10 16:00:00', null, 9, 1);