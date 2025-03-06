cmake_minimum_required(VERSION 3.28)
project(Exercise_I C)

set(CMAKE_C_STANDARD 11)

add_executable(Exercise_I client-program.c
        server-program.c)
