
namespace grp3PROJECT
{
    partial class MaintainForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.btnDisplaySuppliers = new System.Windows.Forms.Button();
            this.btnDisplayProducts = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridView1
            // 
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Location = new System.Drawing.Point(29, 23);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.Size = new System.Drawing.Size(503, 229);
            this.dataGridView1.TabIndex = 0;
            this.dataGridView1.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellContentClick);
            // 
            // btnDisplaySuppliers
            // 
            this.btnDisplaySuppliers.Location = new System.Drawing.Point(29, 295);
            this.btnDisplaySuppliers.Name = "btnDisplaySuppliers";
            this.btnDisplaySuppliers.Size = new System.Drawing.Size(106, 30);
            this.btnDisplaySuppliers.TabIndex = 1;
            this.btnDisplaySuppliers.Text = "Display Suppliers";
            this.btnDisplaySuppliers.UseVisualStyleBackColor = true;
            this.btnDisplaySuppliers.Click += new System.EventHandler(this.btnDisplaySuppliers_Click);
            // 
            // btnDisplayProducts
            // 
            this.btnDisplayProducts.Location = new System.Drawing.Point(174, 295);
            this.btnDisplayProducts.Name = "btnDisplayProducts";
            this.btnDisplayProducts.Size = new System.Drawing.Size(146, 30);
            this.btnDisplayProducts.TabIndex = 2;
            this.btnDisplayProducts.Text = "Display Orders/Products";
            this.btnDisplayProducts.UseVisualStyleBackColor = true;
            this.btnDisplayProducts.Click += new System.EventHandler(this.btnDisplayProducts_Click);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(484, 302);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(106, 23);
            this.button1.TabIndex = 3;
            this.button1.Text = "View Details";
            this.button1.UseVisualStyleBackColor = true;
            // 
            // MaintainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.btnDisplayProducts);
            this.Controls.Add(this.btnDisplaySuppliers);
            this.Controls.Add(this.dataGridView1);
            this.Name = "MaintainForm";
            this.Text = "MaintainForm";
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.Button btnDisplaySuppliers;
        private System.Windows.Forms.Button btnDisplayProducts;
        private System.Windows.Forms.Button button1;
    }
}