using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Kalkulator
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            int silnia = 1;
            if (int.TryParse(NMB1.Text, out int result))
            {
                for (int i = 2; i < result; i++)
                {
                    silnia = silnia * i;
                }
            }
            else silnia = -1;
            int silnia2 = 1;
            if (int.TryParse(NMB2.Text, out int result2))
            {
                for (int i = 2; i < result2; i++)
                {
                    silnia2 = silnia2 * i;
                }
            }
            else silnia2 = -1;
            if (silnia != -1 && silnia2 != -1)
            {
                MessageBox.Show(NMB1.Text + "!=" + silnia + "\n" + NMB2.Text + "!=" + silnia2);
            }
            else MessageBox.Show("Wpisz prawidlowe wartosci");
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            if (int.TryParse(NMB1.Text, out int result) && int.TryParse(NMB2.Text, out int result2))
            {
                int x = result, y = result2;

                while (x != y)
                {

                    if (x > y)
                        x = x - y;
                    else
                        y = y - x;
                }
                MessageBox.Show("NWD to " + x);
            }
            else MessageBox.Show("Wpisz prawidlowe wartosci");
        }

        private void Button_Click_2(object sender, RoutedEventArgs e)
        {
            if (int.TryParse(NMB1.Text, out int result) && int.TryParse(NMB2.Text, out int result2))
            {
                int x = result, y = result2;
                while (x != y)
                {

                    if (x > y)
                        x = x - y;
                    else
                        y = y - x;
                }
                int z=Math.Abs(result * result2) / x;
                MessageBox.Show("NWW to "+z);
            }
            else MessageBox.Show("Wpisz prawidlowe wartosci");
        }
    }
}
