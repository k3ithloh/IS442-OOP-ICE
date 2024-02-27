from Soldier import Soldier

class Commando(Soldier):
    def __init__(self, name, base_allowance, vocation_allowance):
        Soldier.__init__(self, name, base_allowance)
        self.vocation_allowance = vocation_allowance

    @property
    def gross_allowance(self):
        return self.base_allowance + self.vocation_allowance

    def __str__(self):
        return "Commando{{{}, vocationAllowance={:.1f}}}".format(Soldier.__str__(self), self.vocation_allowance)
