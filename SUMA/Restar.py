import Suma 

class Resta(Suma.Suma):
    def __init__(self, a, b):
        super(Resta, self).__init__(a, b)

    def Sumar(self):
        return self.get_a() - self.get_b()
