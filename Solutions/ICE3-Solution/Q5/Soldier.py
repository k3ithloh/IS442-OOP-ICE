class Soldier:
    def __init__(self, name, base_allowance):
        self.name = name
        self.base_allowance = base_allowance

    @property
    def gross_allowance(self):
        return self.base_allowance

    def __str__(self):
        #return "Soldier{{name='{}', baseAllowance={:.1f}}}".format(self.name, self.base_allowance)
        return f"Soldier{{name='{self.name}', baseAllowance={self.base_allowance:.1f}}}"
