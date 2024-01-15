Understanding Java Data Types: int, float, and double

Java is a statically typed language, which means variables must be declared before they can be used. This declaration includes specifying the data type of the variable. Among the most commonly used data types in Java are int, float, and double. Each of these data types serves different purposes and has its own characteristics.
int (Integer Type)
Definition

    Type: Integer
    Size: 32 bits
    Range: -2,147,483,648 to 2,147,483,647

Characteristics

    int is used to store integer values (whole numbers) without any decimal points.
    It is a signed 32-bit type, meaning it has 32 bits of storage and can represent both positive and negative values.
    Suitable for arithmetic operations, loop counters, array indexing, etc.

Example

java

int count = 100;

float (Floating-Point Type)
Definition

    Type: Floating-Point
    Size: 32 bits
    Precision: 6-7 significant decimal digits

Characteristics

    float is used to store numbers with decimal points, known as floating-point numbers.
    It is a single-precision 32-bit IEEE 754 floating point.
    It's not recommended when precise values are required, such as in currency calculations, due to potential rounding errors.

Example

java

float temperature = 98.6f;

double (Double-Precision Floating-Point Type)
Definition

    Type: Floating-Point
    Size: 64 bits
    Precision: 15-16 significant decimal digits
