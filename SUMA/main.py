import Suma, Restar
def main():
    s1 = Suma.Suma(1.5, 2.5)
    r1 = Restar.Resta(1.5, 2.5)
    print('La suma es: ' + str(s1.Sumar()) +
          '\n La resta es: ' + str(r1.Sumar()) + '\n')


if __name__ == '__main__':
    main()
