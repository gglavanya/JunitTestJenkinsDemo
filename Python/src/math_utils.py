
class MathUtils:

    def add(self, a: int, b: int) -> int:
        return a+b
    
    def subtract(self, a: int, b: int) -> int:
        return a-b
    
    def multiply(self, a: int, b: int) -> int:
        return a*b
    
    def divide(self, a: int, b: int) -> float:
        if b== 0:
            return -1.0
        return a/b

