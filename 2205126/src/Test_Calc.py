import unittest
from main.Calculator import Calculator

class TestCalc(unittest.TestCase):

    calc = Calculator()

    def test_add(self):
        result = TestCalc.calc.add(10, 5)
        self.assertEqual(result,15)

    def test_subtract(self):
        result = TestCalc.calc.subtract(10, 5)
        self.assertEqual(result, 5)

    def test_multiply(self):
        result = TestCalc.calc.multiply(10, 2)
        self.assertEqual(result, 20)

    def test_divide(self):
        result = TestCalc.calc.divide(10, 2)
        self.assertEqual(result, 5)

    def test_powered(self):
        result = TestCalc.calc.powered(10, 2)
        self.assertEqual(result, 100)
        
        with self.assertRaises(ValueError):
        	TestCalc.calc.divide(10, 0)


if __name__ == '__main__':
    unittest.main()
    
