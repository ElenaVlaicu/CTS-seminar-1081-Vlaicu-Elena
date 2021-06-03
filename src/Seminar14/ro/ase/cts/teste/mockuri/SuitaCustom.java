package Seminar14.ro.ase.cts.teste.mockuri;

import Seminar14.ro.ase.cts.teste.categorii.GetPromovabilitateCategory;
import Seminar14.ro.ase.cts.teste.categorii.TesteUrgente;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({TesteUrgente.class, Grupa2Test.class})
@Categories.IncludeCategory(GetPromovabilitateCategory.class)
@Categories.ExcludeCategory(TesteUrgente.class)

//daca nu spunem ca includem nimic dar ecludem ceva, se vor rula toaate mai putin cele excluse

public class SuitaCustom {

}
