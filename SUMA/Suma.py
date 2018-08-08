class Suma(object):

    def __init__(self, a, b):
        self.__a = a
        self.__b = b
        self.set_a(a)
        self.set_b(b)
    def set_a(self, a):
        self.__a = a
    def set_b(self, b):
        self.__b = b
    def get_a(self):
        return self.__a
    def get_b(self):
        return self.__b
    def Sumar(self):
        return self.__a + self.__b
