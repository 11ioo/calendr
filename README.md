# SQLCODE
CREATE TABLE SCHEDULE(
id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(15) NOT NULL,
password VARCHAR(30) NOT NULL,
todo VARCHAR(50) NULL,
date DATETIME NULL,
CONSTRAINT SCHEDULE_PK PRIMARY KEY(id)
);
# API
openapi: "3.1.0"
info:
title: "demo API"
description: "demo API"
version: "1.0.0"
servers:
- url: "https://demo"
  paths:
  /todo:
  post:
  summary: "POST todo"
  operationId: "createTodo"
  requestBody:
  content:
  application/json:
  schema:
  $ref: "#/components/schemas/TodoCreateRequestDto"
  required: true
  responses:
  "200":
  description: "OK"
  content:
  '*/*':
  schema:
  $ref: "#/components/schemas/TodoResponseDto"
  get:
  summary: "GET todo"
  operationId: "getAllTodo"
  responses:
  "200":
  description: "OK"
  content:
  '*/*':
  schema:
  type: "array"
  items:
  $ref: "#/components/schemas/TodoResponseDto"
  /todo/param:
  get:
  summary: "GET todo/param"
  operationId: "getTodoById"
  parameters:
  - name: "id"
  in: "query"
  required: true
  schema:
  type: "integer"
  format: "int64"
  responses:
  "200":
  description: "OK"
  content:
  '*/*':
  schema:
  $ref: "#/components/schemas/TodoResponseDto"
  put:
  summary: "PUT todo/param"
  operationId: "updateTodo"
  parameters:
  - name: "id"
  in: "query"
  required: true
  schema:
  type: "integer"
  format: "int64"
  - name: "password"
  in: "query"
  required: true
  schema:
  type: "integer"
  format: "int64"
  requestBody:
  content:
  application/json:
  schema:
  $ref: "#/components/schemas/TodoUpdateRequestDto"
  required: true
  responses:
  "200":
  description: "OK"
  content:
  '*/*':
  schema:
  $ref: "#/components/schemas/TodoResponseDto"
  delete:
  summary: "DELETE todo/param"
  operationId: "deleteTodo"
  parameters:
  - name: "id"
  in: "query"
  required: true
  schema:
  type: "integer"
  format: "int64"
  - name: "password"
  in: "query"
  required: true
  schema:
  type: "integer"
  format: "int64"
  responses:
  "200":
  description: "OK"
  content:
  '*/*':
  schema:
  type: "string"
  components:
  schemas:
  TodoCreateRequestDto:
  type: "object"
  properties:
  title:
  type: "string"
  contents:
  type: "string"
  username:
  type: "string"
  date:
  type: "string"
  password:
  type: "integer"
  format: "int64"
  TodoResponseDto:
  type: "object"
  properties:
  id:
  type: "integer"
  format: "int64"
  title:
  type: "string"
  contents:
  type: "string"
  username:
  type: "string"
  date:
  type: "string"
  TodoUpdateRequestDto:
  type: "object"
  properties:
  title:
  type: "string"
  contents:
  type: "string"
  username:
  type: "string"
          
