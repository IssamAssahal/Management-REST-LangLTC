INSERT INTO section (section_id, name, class_number) VALUES (1, 'Beginners', 10);

INSERT INTO class_room (class_room_id, section_id, name, capacity) VALUES (1, 1, 'Beginners1', 12);

INSERT INTO course (course_id, class_room_id, name, hours_number, price, start_date, finish_date) VALUES (1, 1, 'Conversations ', 20, 1500, '2018-10-11', '2018-10-31');

INSERT INTO teacher (teacher_id, first_name, last_name, middle_name, age, address, phone_number, email, base_salary, working_hours, bonus, hired_date, level)
VALUES (1, 'Jack', 'Ferderk', 'Salo', 45, '21 Street 5', '0045789821', 'jack@gmail.com', 4000, 12, 0, '2018-10-11', 'PRO');


INSERT INTO student (student_id, course_id, teacher_id, first_name, last_name, middle_name, age, address, phone_number, email, level, register_date, finish_date)
VALUES (1, 1, 1, 'issam', 'assahal', null, 25, '58 street 7', '004875132', 'issam@gmail.com', 'B2', '2018-10-03', '2018-10-23');

INSERT INTO public.test_paper (test_paper_id, name, duration, teacher_id, course_id) VALUES (1, 'B1 test', 3, 1, 1);
INSERT INTO public.test_paper (test_paper_id, name, duration, teacher_id, course_id) VALUES (2, 'B2 test', 2, 1, 1);

INSERT INTO public.test_write_by_student (fk_student, fk_test_paper, test_date, test_score) VALUES (1, 1, '2018-10-24', 10);
INSERT INTO public.test_write_by_student (fk_student, fk_test_paper, test_date, test_score) VALUES (1, 2, '2018-10-24', 14);