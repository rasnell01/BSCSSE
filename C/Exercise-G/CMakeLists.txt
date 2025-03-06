cmake_minimum_required(VERSION 3.28)
project(Exercise_G C)

set(CMAKE_C_STANDARD 11)

add_executable(Exercise_G scheduling-algorithms-module.c
        scheduling-algorithms.h
        program-driver.c)
