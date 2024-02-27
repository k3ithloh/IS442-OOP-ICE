from Commando import Commando
from Soldier import Soldier

if __name__ == '__main__':
    c = Commando("Peter", 5000, 200)
    s = Soldier("John", 3000)

    print(c)
    print(s)

    print("Commando's base allowance : {}".format(c.base_allowance))
    print("Commando's gross allowance : {}".format(c.gross_allowance))
    print("Soldier's base allowance : {}".format(s.base_allowance))
    print("Soldier's base allowance : {}".format(s.gross_allowance))
