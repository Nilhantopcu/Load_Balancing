# Load Balancing

## Table of Contents
- [Introduction](#introduction)
- [High-Level Approach](#high-level-approach)
- [Design Overview](#design-overview)
- [Usage](#usage)

## Introduction

A load balancing system has been implemented in this project, employing both static and dynamic load balancers. The system has been designed to efficiently distribute client requests among a series of servers, optimizing for load states. Two types of load balancers have been implemented: static and dynamic.

- Static Load Balancer:
  - A server ArrayList has been maintained.
  - Methods for adding and removing servers have been implemented.
  - Servers are randomly selected for request distribution using the 'handleServer()' method.

- Dynamic Load Balancer:
  - Similar to the static load balancer, it selects servers based on the least load.
  - Employs a server ArrayList, add and remove methods, and a 'handleRequest()' method.

The UDP protocol has been chosen for its low latency and simplicity. The Request class defines request types such as directory listing, file transfer, computation, and video streaming.

## High-Level Approach

1. **UDP Protocol**: Chosen for its low latency, making it suitable for real-time applications and fast data transmission. Enables fast packet forwarding and load balancing for efficient data routing.
   
2. **Request Types**: A Request class has been designed to define types such as directory listing, file transfer, computation, and video streaming.

3. **Load Balancing**:Both static and dynamic load balancers have been implemented to distribute incoming UDP packets among servers. Ensures load balancing for fair distribution and optimal performance.
   
## Design Overview

1. **Client Class**:
   - Variables:
     - 'staticLoadBalancer' and 'dynamicLoadBalancer' for request distribution.
   - Methods:
     - A constructor has been implemented to hold static and dynamic load balancers.
     - 'sendRequest()': Requests are sent to both static and dynamic load balancers.
       
2. **Server Class**:
   - Variables:
     - 'name' and load variables.
   - Methods:
     - A constructor has been implemented to initialize the server with a name.
     - 'processRequest()': Processes incoming requests based on their type.
     - Request Handling Methods: 'handleDirectoryListening()', 'handleFileRequest()', 'handleComputation()', 'handleVideoStreaming()'.
       
3. **StaticLoadBalancer Class**:
   - A list of servers has been maintained.
   - 'add()' and 'remove()' methods have been implemented for server management.
   - 'handleServer()': Servers are randomly selected for request distribution.
     
4. **DynamicLoadBalancer Class**:
   - Similar to the static load balancer.
   - 'handleRequest()': Servers with the least load are chosen for request distribution.
     
5. **Request Class**:
    - Defines request types: directory listing, file transfer, computation, video streaming.
      
6. **Main Class**:
    - Used for testing and running the load balancing system.
      
## Usage
1. The repository can be cloned.
2. The Main class can be compiled and run.
3. Load balancing performance can be monitored with the provided load balancers.
