cmake_minimum_required(VERSION 3.28)
project(Exercise_F C)

set(CMAKE_C_STANDARD 11)

add_executable(Exercise_F program-driver.c
        student-module.c
        signal-handlers-module.c)
